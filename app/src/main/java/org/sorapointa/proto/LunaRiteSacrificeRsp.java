package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LunaRiteSacrificeRsp {
    @Tag(tag=13) public Integer areaId = null;
    @Tag(tag=14) public List<Integer> sacrificeList = new ArrayList<>();
    @Tag(tag=8) public Integer index = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
