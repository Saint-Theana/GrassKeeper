package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ForgeStartReq {
    @Tag(tag=7) public Integer avatarId = null;
    @Tag(tag=4) public Integer forgeId = null;
    @Tag(tag=6) public Integer forgeCount = null;
}
