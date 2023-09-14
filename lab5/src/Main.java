public class Main {
    public static void main(String[] args) {
        Avatar girlAvatar = new Avatar();
        Avatar maleAvatar = new Avatar();

        AvatarAppearance girlAvatarAppearance = new AvatarAdapter(girlAvatar);
        AvatarAppearance maleAvatarAppearance = new AvatarAdapter(maleAvatar);

        System.out.println("\n");
        
        String hairColor = "blonde";
        String dressType = "sharee";
        String shoeType = "heels";
        String faceColor = "fair";

        girlAvatarAppearance.changeHairColor(hairColor);
        girlAvatarAppearance.changeDress(dressType);
        girlAvatarAppearance.changeShoe(shoeType);
        girlAvatarAppearance.changeFaceColor(faceColor);

        System.out.println("\n");

        hairColor = "black";
        dressType = "formal";
        shoeType = "slides";
        faceColor = "dark";

        maleAvatarAppearance.changeHairColor(hairColor);
        maleAvatarAppearance.changeDress(dressType);
        maleAvatarAppearance.changeShoe(shoeType);
        maleAvatarAppearance.changeFaceColor(faceColor);
    }
}






