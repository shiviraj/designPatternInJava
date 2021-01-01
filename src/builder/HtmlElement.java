package builder;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {
    public String name, text;
    public ArrayList<HtmlElement> elements = new ArrayList<>();
    private final String newLine = System.lineSeparator();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }

    private String toStringImpl(int indent) {
        StringBuilder sb = new StringBuilder();
        int indentSize = 2;
        String i = String.join("", Collections.nCopies(indent * indentSize, " "));
        sb.append(String.format("%s<%s>%s", i, name, newLine));

        if (text != null && !text.isEmpty()) {
            sb.append(String.join("", Collections.nCopies(indentSize * (indent + 1), " ")))
                .append(text)
                .append(newLine);
        }

        for (HtmlElement element : elements) {
            sb.append(element.toStringImpl(indent + 1));
        }

        sb.append(String.format("%s</%s>%s", i, name, newLine));
        return sb.toString();
    }
}
