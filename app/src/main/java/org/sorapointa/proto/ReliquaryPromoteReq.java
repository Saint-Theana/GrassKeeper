package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReliquaryPromoteReq {
    @Tag(tag=10) public Long itemGuid = null;
    @Tag(tag=13) public Long targetGuid = null;
}
