package com.alexsantos.proyecto01.graphs;

/**
 *
 * @author alex
 */
public class LineGraph extends Graph {

    String file;

    public LineGraph() {
        file = "";
    }

    @Override
    public void setProp(Object[] prop) {
        if (prop[0] != null) {
            // ENVIAR OTRAS PROPIEDADES
            super.setProp(prop);

            // NOMBRE DE LA PROPIEDAD
            String key = (String) prop[1];

            // ASIGNAR
            if (key.equals("file")) {
                if (file.isEmpty()) {
                    file = (String) prop[0];
                } else {
                    System.err.println("\nError en linea " + prop[2] + " ya se asigno una vez el titulo del Eje X.\n");
                }
            }
        } else {
            System.err.println("\nError valor nulo en linea " + prop[2] + "\n");
        }
    }

    @Override
    public void generateGraph(String path) {
    }
}
