package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SpringUseRsp {
    @Tag(tag=3) public Long guid = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
