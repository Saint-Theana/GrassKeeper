package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TryEnterHomeRsp {
    @Tag(tag=15) public Integer targetUid = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public List<Integer> paramList = new ArrayList<>();
}
