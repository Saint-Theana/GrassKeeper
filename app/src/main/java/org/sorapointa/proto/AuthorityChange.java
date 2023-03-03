package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityAuthorityInfo.*;
import org.sorapointa.proto.EntityAuthorityInfo;

public class AuthorityChange {
    @Tag(tag=5) public EntityAuthorityInfo entityAuthorityInfo = null;
    @Tag(tag=3) public Integer authorityPeerId = null;
    @Tag(tag=13) public Integer entityId = null;
}
