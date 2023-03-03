package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum LuaShellType {
        @Tag(tag=0) LUA_SHELL_TYPE_LUASHELL_NONE ,
        @Tag(tag=1) LUA_SHELL_TYPE_LUASHELL_NORMAL ,
        @Tag(tag=2) LUA_SHELL_TYPE_LUASHELL_SECURITY ,
        @Tag(tag=3) LUA_SHELL_TYPE_LUASHELL_SHELL_CODE ;
}
