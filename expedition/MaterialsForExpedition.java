package expedition;

public final class MaterialsForExpedition extends Material{
    private geographic.GeoObject location;

    public MaterialsForExpedition(ListMaterials m) {
        if (m == ListMaterials.DOGS){
            setName("Собаки");
        } else if (m == ListMaterials.SLEIGH){
            setName("Сани");
        } else if (m == ListMaterials.TENTS){
            setName("Палатки");
        } else if (m == ListMaterials.EQUIPMENT){
            setName("Необходимое снаряжение");
        } else if (m == ListMaterials.PARTS_OF_PLANE){
            setName("Части самолета");
        }
        else if (m == ListMaterials.FOOD){
            setName("Продовольствие");
        }
        System.out.println("Создан материал " + getName());
    }

    public void changeLocation(geographic.GeoObject GObj){
        this.location = GObj;
    }

    @Override
    public void moveTo (geographic.GeoObject gobj){
        changeLocation(gobj);
        System.out.println("Материал " + getName() + " доставляется в " + gobj.getName());
    }

    @Override
    public String toString() {
        return "MaterialsForExpedition{}";
    }
}
