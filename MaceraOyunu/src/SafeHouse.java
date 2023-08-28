public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Güvenli ev");
    }
    @Override
   public boolean onLocation(){
        System.out.println("Güvenli evdesiniz.");
        System.out.println("Canınız yenilendi.");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
