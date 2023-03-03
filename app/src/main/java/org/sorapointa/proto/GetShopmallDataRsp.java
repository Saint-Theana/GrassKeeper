package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetShopmallDataRsp {
    @Tag(tag=15) public List<Integer> shopTypeList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
