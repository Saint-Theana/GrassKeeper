package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MassivePropSyncInfo {
    @Tag(tag=1,isSigned=true) public Long id = null;
    @Tag(tag=2) public List<MassivePropParam> propList = new ArrayList<>();
}
