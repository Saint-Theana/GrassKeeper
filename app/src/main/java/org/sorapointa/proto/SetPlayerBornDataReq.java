package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetPlayerBornDataReq {
    @Tag(tag=2) public Integer avatarId = null;
    @Tag(tag=13) public String nickName = null;
}
