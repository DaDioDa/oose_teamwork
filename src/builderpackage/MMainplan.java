package builderpackage;

public interface MMainplan
{
    public void setStaich(String staich);
    public void setSauce(String sauce);

}

class MMain implements MMainplan
{
    private String sauce;   //tomato
    private String staich;  //rice

    public void setStaich(String staich)
    {
        this.staich = staich;
    }

    public void setSauce(String sauce)
    {
        this.sauce = sauce;
    }
}

interface MMainBuilder
{
    public void buildsauce();
    public void buildstaich();
    public MMain getMMain();
}

class TomatoNoodle implements MMainBuilder
{
    private MMain MMain;

    public TomatoNoodle() {
        this.MMain = new MMain();
    }

    public void buildsauce()
    {
        MMain.setSauce("Tomato");
    }
    public void buildstaich()
    {
        MMain.setStaich("Noodle");
    }

    public MMain getMMain()
    {
        return this.MMain;
    }
}

class Diretor
{
    private MMainBuilder mMainBuilder;
    public Diretor(MMainBuilder mMainBuilder)
    {
        this.mMainBuilder = mMainBuilder;
    }

    public MMain getMMain()
    {
        return this.mMainBuilder.getMMain();
    }

    public void makeMMain()
    {
        this.mMainBuilder.buildsauce();
        this.mMainBuilder.buildstaich();
    }
}

class Builder
{
    public static void main(String[] args) {
        MMainBuilder tomatonoodle = new TomatoNoodle();
        Diretor diretor = new Diretor(tomatonoodle);
        diretor.makeMMain();
        MMain mMain = diretor.getMMain();
        //System.out.println("Main is "+ mMain);
        System.out.println(tomatonoodle);
    }
}






