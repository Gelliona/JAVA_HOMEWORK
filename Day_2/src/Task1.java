import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String text = "{\"Name\":\"Ivanov\",\"Country\":\"Russia\",\"City\":\"Moscow\",\"age\":\"null\"}";
        String select = "select * from students where ";
        String clean = text.replace("{", "")
                .replace("}", "");


        String[] newText = clean.split(",");
        StringBuilder sql = new StringBuilder();
        sql.append(select);

        for ( int i = 0; i < newText.length; i++ ) {

            String[] string3 = newText[i].split(":");
            System.out.printf("%s = %s\n", string3[0], string3[1]);

            if (!string3[1].equals("\"null\"")) {
                if (i > 0)
                    sql.append(" and ");
                sql.append(string3[0].replace("\"", "").toLowerCase(Locale.ROOT));
                sql.append(" = ");
                sql.append(string3[1]);
            }

        }
        System.out.println(sql);
    }
}
