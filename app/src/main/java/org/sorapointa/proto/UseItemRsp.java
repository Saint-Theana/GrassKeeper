package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UseItemRsp {
    @Tag(tag=5) public Long guid = null;
    @Tag(tag=1) public Long targetGuid = null;
    @Tag(tag=4) public Integer itemId = null;
    @Tag(tag=8) public Integer optionIdx = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
