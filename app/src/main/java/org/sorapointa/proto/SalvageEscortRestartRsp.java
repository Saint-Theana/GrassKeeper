package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvageEscortRestartRsp {
    @Tag(tag=14) public Integer galleryId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
