package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LuaSetOptionNotify_LuaOptionType.*;
import org.sorapointa.proto.LuaSetOptionNotify_LuaOptionType;

public class LuaSetOptionNotify {
    public enum LuaSetOptionNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=395) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public String luaSetParam = null;
    @Tag(tag=14) public Integer optionType = null;
}
