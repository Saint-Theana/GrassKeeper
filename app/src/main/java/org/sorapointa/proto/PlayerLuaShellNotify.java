package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LuaShellType.*;
import org.sorapointa.proto.LuaShellType;

public class PlayerLuaShellNotify {
    @Tag(tag=7) public Integer shellType = null;
    @Tag(tag=5) public Integer id = null;
    @Tag(tag=12) public byte[] luaShell = null;
    @Tag(tag=10) public Integer useType = null;
}
