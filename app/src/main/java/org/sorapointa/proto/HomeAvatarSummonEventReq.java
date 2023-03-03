package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarSummonEventReq {
    @Tag(tag=7) public Integer avatarId = null;
    @Tag(tag=9) public Integer suitId = null;
    @Tag(tag=12) public Integer guid = null;
}
