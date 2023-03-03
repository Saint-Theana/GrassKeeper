package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAllUnlockNameCardRsp {
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<Integer> nameCardList = new ArrayList<>();
}
