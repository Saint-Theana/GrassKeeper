package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeKickPlayerReq {
    @Tag(tag=12) public Integer targetUid = null;
    @Tag(tag=13) public Boolean isKickAll = null;
}
