package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum LuaShellType {
        @Tag(tag=0) LuashellNone ,
        @Tag(tag=1) LuashellNormal ,
        @Tag(tag=2) LuashellSecurity ,
        @Tag(tag=3) LuashellShellCode ;
}
