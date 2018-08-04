package tren;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;

/**
 * Created by Михаил Алексеевич on 06.08.2016.
 */
public class Pencil { // карандаш обыкновенный
        private String material = "Linden";
        private String painting = "yellowish-white"; // окраска оправы
        private final String kohler; // колер грифеля  = "grey"
        private final String hardness; // твердость грифеля {H,	F,	HB,	B}
        private int length = 18; //длинна
        private final int diameter; // диаметр
        private boolean eraser; // наличие ластика(ластик не описывал - это другой объект)
        private int sharpness; // очиненность
        private final String manufacturer; // производитель
        private String owner;

        public LinkedHashMap<String, String> written = new LinkedHashMap<String, String>(); //private Map<String, String> written;  writingDate,value

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss"); // Необходимый шаблон для памяти //"ss.mm.HH.dd.MM.yyyy"

        public Pencil(String kohler, String hardness, int diameter, String manufacturer) {
            this.kohler = kohler;
            this.hardness = hardness;
            this.diameter = diameter;
            this.manufacturer = manufacturer;
        }

        //TODO Set задаем
        public void setMaterial(String material){
            this.material = material;
        }
        public void setPainting(String painting){
            this.painting = painting;
        }
        public void setLength(int length){
            this.length = length;
        }
        public void setEraser(boolean eraser){
            this.eraser = eraser;
        }
        private void setOwner(String owner){
            this.owner = owner;
        }
        private void setSharpness(int sharpness){
            this.sharpness = sharpness;
        }

         //TODO Get получаем
        public String getMaterial (){
        return this.material;
    }
        public String getPainting()
        {
            return this.painting;
        }
        public int getLength()
        {
            return this.length;
        }
        public int getDiameter()
        {
            return this.diameter;
        }
        public boolean getEraser()
        {
            return this.eraser;
        }
        public String getKohler()
        {
            return this.kohler;
        }
        public String getHardness()
        {
            return this.hardness;
        }
        public int getSharpness()
        {
            return this.sharpness;
        }
        public String getManufacturer()
        {
            return this.manufacturer;
        }
        public String getOwner() {
            return  this.owner;
        }

        // TODO Свойства
        public Pencil sharpen(Pencil pencil) { // очинить
            if (pencil.getLength()<1) {
                System.out.println("Дальнейшее использование карандаша - не возможно.");
            }
            if(pencil.length > 0){
            pencil.length--;
            pencil.sharpness = 30;
                System.out.println("Карандаш оточен.");
            }
            return pencil;
        }

        public Pencil breakPencil(Pencil pencil){
            int buf = pencil.getLength() / 2;
            pencil.setLength(buf);
            Pencil oblomok = new Pencil(pencil.getKohler(), pencil.getHardness(), diameter, pencil.getManufacturer());
            oblomok.setLength(buf);
            oblomok.setSharpness(0);

            return oblomok;
        }

        public Pencil breakSharpeness(Pencil pencil){
            pencil.setSharpness(0);
            return pencil;
        }

        public void changeOwner(String NewOwner){
            this.setOwner(NewOwner);
        }

        public void write(String value){
            if (this.getSharpness() > 0) {
                written.put(dateFormat.format(new Date()), value);
                sharpness--;
                System.out.println("Осуществена запись - " + value);
            }
            else System.out.println("Необходимо очинить карандашь.");
        }

        public String rememberWritten(String date){ // вопрос соответствия запроса шаблону
            return this.written.get(date);
        }
        /*public String erase( String value) { Не реализовано - т.к. метод принадлежит другому объекту
            if (eraser == true){
                value = null;
            }
            return value;
        }*/
}