package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LuaSetOptionNotify {
    public enum LuaOptionType {
        @Tag(tag=0) LUA_OPTION_TYPE_NONE ,
        @Tag(tag=1) LUA_OPTION_TYPE_PLAYER_INPUT ;
    }

    @Tag(tag=8) public String luaSetParam = null;
    @Tag(tag=10) public LuaOptionType optionType = null;
}
