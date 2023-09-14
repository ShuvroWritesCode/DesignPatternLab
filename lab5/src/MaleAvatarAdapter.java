public class MaleAvatarAdapter implements AvatarAppearance {
    private MaleAvatar maleAvatar;

    public MaleAvatarAdapter() {
        this.maleAvatar = new MaleAvatar();
    }

    @Override
    public void changeHairColor(String color) {
        maleAvatar.setMaleHairColor(color);
    }

    @Override
    public void changeDress(String dressType) {
        maleAvatar.setMaleDress(dressType);
    }

    @Override
    public void changeShoe(String shoeType) {
        maleAvatar.setMaleShoe(shoeType);
    }

    @Override
    public void changeFaceColor(String faceColorType) {
        maleAvatar.setMaleFaceColor(faceColorType);
    }
}
