package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvagePreventRestartRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer galleryId = null;
}
