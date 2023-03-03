package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ClientInputType {
        @Tag(tag=0) CLIENT_INPUT_TYPE_NONE ,
        @Tag(tag=1) CLIENT_INPUT_TYPE_KEYBOARD_MOUSE ,
        @Tag(tag=2) CLIENT_INPUT_TYPE_GAMEPAD ,
        @Tag(tag=3) CLIENT_INPUT_TYPE_TOUCH_PANEL ;
}
