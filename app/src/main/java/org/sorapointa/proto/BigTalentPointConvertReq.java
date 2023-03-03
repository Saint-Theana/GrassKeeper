package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BigTalentPointConvertReq {
    @Tag(tag=6) public List<Long> itemGuidList = new ArrayList<>();
    @Tag(tag=3) public Long avatarGuid = null;
}
