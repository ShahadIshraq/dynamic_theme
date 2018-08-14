package com.Theme;

/**
 *  This is part of the template engine of the dynamic theme scheme.
 */

public class Theme {

    /**
     *
     *  The id or class names that will have dynamic color
     *  If the element has the "id" of any html element,then it shall have "#" at the beginning.
     *  If the element has the "class" of any html element,then it shall have "." at the beginning.
     *
     *  Be careful of the naming of the classes. Classes must have "-" in between parts of the name, not "_" .
     *
     */
    private static final String fields[] = {
            "#header_container",
            ".column-header-container",
            "#board_container",
            "#page_base_container",
            "#footer_container"};

    /**
     *  Number of dynamic fields.
     */
    private static final int numberOfFields = 5;


}