package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ResVersionConfig.*;
import org.sorapointa.proto.ResVersionConfig;

public class GetNextResourceInfoRsp {
    @Tag(tag=14) public String nextResourceUrl = null;
    @Tag(tag=2) public ResVersionConfig nextResVersionConfig = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
