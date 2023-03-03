package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueHealAvatarsReq {
    @Tag(tag=1) public Integer dungeonId = null;
    @Tag(tag=3) public Integer cellId = null;
}
