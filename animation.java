@TargetApi(21)
private void show(View v) {
    final int cx =  v.getWidth() - getResources().getDimensionPixelOffset(R.dimen.default_horizontal_margin);
    final int cy = v.getHeight() - getResources().getDimensionPixelOffset(R.dimen.floating_button_vertical_margin);

    int width = v.getWidth() ;
    int height = v.getHeight();

    float finalRadius = Math.max(width, height) / 2 + Math.max(width, height);

    Animator anim = ViewAnimationUtils.createCircularReveal(v, cx, cy, 0, finalRadius);
    startBackgroundColorAnimation(v,
            getResources().getColor(R.color.colorPrimary),
            getResources().getColor(R.color.colorWhite),
            500);

    anim.setDuration(500);
    anim.start();
}

@TargetApi(21)
private void hide(View v) {
    final int cx =  v.getWidth() - getResources().getDimensionPixelOffset(R.dimen.default_horizontal_margin);
    final int cy = v.getHeight() - getResources().getDimensionPixelOffset(R.dimen.floating_button_vertical_margin);

    int width = v.getWidth() ;
    int height = v.getHeight();

    float finalRadius = Math.max(width, height) / 2 + Math.max(width, height);
    Animator anim = ViewAnimationUtils.createCircularReveal(v, cx, cy, finalRadius, 0);
    anim.setDuration(250);
    anim.start();
}

private void startBackgroundColorAnimation(final View view, int startColor, int endColor,
                                            long duration) {
    ValueAnimator anim = new ValueAnimator();
    anim.setIntValues(startColor, endColor);
    anim.setEvaluator(new ArgbEvaluator());
    anim.setDuration(duration);
    anim.addUpdateListener(valueAnimator -> view.setBackgroundColor((Integer) valueAnimator.getAnimatedValue()));
    anim.start();
}