package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerDieOption.*;
import org.sorapointa.proto.PlayerDieOption;

public class DungeonDieOptionRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer reviveCount = null;
    @Tag(tag=6) public Integer dieOption = null;
}
