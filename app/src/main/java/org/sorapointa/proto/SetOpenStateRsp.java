package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetOpenStateRsp {
    @Tag(tag=9) public Integer key = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer value = null;
}
