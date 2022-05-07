package com.ay.patterns.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ElementVisitorDemo {

    public static void main(String[] args) {

        Visitor visitor = new ElementVisitor();

        Document d = new Document(generateUuid());
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new XmlElement(generateUuid()));

        d.accept(visitor);

        // Second approach

        List<Element> elements = new ArrayList<>();

        elements.add(new JsonElement(generateUuid()));
        elements.add(new JsonElement(generateUuid()));
        elements.add(new XmlElement(generateUuid()));

        elements.forEach(element -> element.accept(visitor));
    }

    private static String generateUuid() {
        return UUID.randomUUID()
                .toString();
    }
}
