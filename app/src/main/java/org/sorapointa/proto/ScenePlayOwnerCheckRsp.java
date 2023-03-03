package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayOwnerCheckRsp {
    @Tag(tag=8) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=1) public Boolean isSkipMatch = null;
    @Tag(tag=9) public Integer playId = null;
    @Tag(tag=5) public Integer wrongUid = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
