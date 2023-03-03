package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DelMailRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public List<Integer> mailIdList = new ArrayList<>();
}
