@TargetApi(21)
private void show(View v) {
    final int cx =  v.getWidth() - getResources().getDimensionPixelOffset(R.dimen.default_horizontal_margin);
    final int cy = v.getHeight() - getResources().getDimensionPixelOffset(R.dimen.floating_button_vertical_margin);

    int width = v.getWidth() ;
    int height = v.getHeight();

    float finalRadius = Math.max(width, height) / 2 + Math.max(width, height);
    Animator anim = ViewAnimationUtils.createCircularReveal(v, cx, cy, 0, finalRadius);
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
    anim.setDuration(500);
    anim.start();
}