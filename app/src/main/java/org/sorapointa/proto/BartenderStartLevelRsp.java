package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderStartLevelRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<Integer> orderList = new ArrayList<>();
    @Tag(tag=10) public Integer levelId = null;
    @Tag(tag=8) public Integer time = null;
}
