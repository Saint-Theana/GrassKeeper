package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterWorldAreaRsp {
    @Tag(tag=1) public Integer areaType = null;
    @Tag(tag=7) public Integer areaId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
