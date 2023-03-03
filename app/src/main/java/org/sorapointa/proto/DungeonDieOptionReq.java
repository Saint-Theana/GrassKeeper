package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerDieOption.*;
import org.sorapointa.proto.PlayerDieOption;

public class DungeonDieOptionReq {
    @Tag(tag=11) public Integer dieOption = null;
    @Tag(tag=14) public Boolean isQuitImmediately = null;
}
