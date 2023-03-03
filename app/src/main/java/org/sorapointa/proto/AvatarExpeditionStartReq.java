package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarExpeditionStartReq {
    @Tag(tag=9) public Integer expId = null;
    @Tag(tag=10) public Long avatarGuid = null;
    @Tag(tag=2) public Integer hourTime = null;
}
