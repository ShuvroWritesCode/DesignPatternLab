public class AvatarAdapter implements AvatarAppearance {
    private Avatar avatar;
    public AvatarAdapter(Avatar avatar) {
        this.avatar = avatar;
    }
    @Override
    public void changeHairColor(String color) {
        avatar.setHairColor(color);
    }
    @Override
    public void changeDress(String dressType) {
        avatar.setDress(dressType);
    }
    @Override
    public void changeShoe(String shoeType) {
        avatar.setDress(shoeType);
    }
    @Override
    public void changeFaceColor(String faceColorType) {
        avatar.setFaceColor(faceColorType);
    }
}