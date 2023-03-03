package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SaveMainCoopRsp {
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public List<Integer> savePointIdList = new ArrayList<>();
    @Tag(tag=14) public Integer id = null;
}
