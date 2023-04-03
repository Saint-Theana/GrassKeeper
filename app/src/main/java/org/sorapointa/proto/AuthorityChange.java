package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityAuthorityInfo.*;
import org.sorapointa.proto.EntityAuthorityInfo;

public class AuthorityChange {
    @Tag(tag=2) public Integer authorityPeerId = null;
    @Tag(tag=4) public EntityAuthorityInfo entityAuthorityInfo = null;
    @Tag(tag=14) public Integer entityId = null;
}
