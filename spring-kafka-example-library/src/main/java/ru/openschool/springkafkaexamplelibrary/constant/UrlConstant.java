package ru.openschool.springkafkaexamplelibrary.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static ru.openschool.springkafkaexamplelibrary.constant.SymbolConstant.CLOSING_CURLY_BRACE;
import static ru.openschool.springkafkaexamplelibrary.constant.SymbolConstant.OPENING_CURLY_BRACE;
import static ru.openschool.springkafkaexamplelibrary.constant.SymbolConstant.SLASH;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UrlConstant {
    public static final String API_URL = SLASH + "api";
    public static final String V1_URL = SLASH + "v1";
    public static final String PLANTS_URL = SLASH + "plants";
    public static final String API_V1_PLANTS_URL = API_URL + V1_URL + PLANTS_URL;
    public static final String PATH_VARIABLE_ID = "id";
    public static final String PATH_VARIABLE_ID_URL = SLASH +
            OPENING_CURLY_BRACE + PATH_VARIABLE_ID + CLOSING_CURLY_BRACE;
}
