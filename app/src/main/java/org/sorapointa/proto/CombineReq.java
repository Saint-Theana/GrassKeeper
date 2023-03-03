package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CombineReq {
    @Tag(tag=12) public Integer combineCount = null;
    @Tag(tag=9) public Integer combineId = null;
    @Tag(tag=14) public Long avatarGuid = null;
}
