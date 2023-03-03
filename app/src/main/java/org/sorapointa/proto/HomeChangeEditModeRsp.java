package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeChangeEditModeRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Boolean isEnterEditMode = null;
}
