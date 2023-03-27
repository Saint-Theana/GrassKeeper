package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ClientInputType {
        @Tag(tag=0) ClientInputNone ,
        @Tag(tag=1) ClientInputKeybordMouse ,
        @Tag(tag=2) ClientInputGamepad ,
        @Tag(tag=3) ClientInputTouchPanel ;
}
