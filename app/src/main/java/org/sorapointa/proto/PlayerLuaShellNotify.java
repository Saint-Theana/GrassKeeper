package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LuaShellType.*;
import org.sorapointa.proto.LuaShellType;

public class PlayerLuaShellNotify {
    public enum PlayerLuaShellNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=191) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public byte[] luaShell = null;
    @Tag(tag=8) public Integer useType = null;
    @Tag(tag=7) public Integer shellType = null;
    @Tag(tag=12) public Integer id = null;
}
