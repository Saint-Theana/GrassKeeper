package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MailTextContent.*;
import org.sorapointa.proto.MailTextContent;
import org.sorapointa.proto.MailCollectState.*;
import org.sorapointa.proto.MailCollectState;
import org.sorapointa.proto.MailItem.*;
import org.sorapointa.proto.MailItem;

public class MailData {
    @Tag(tag=1) public Integer mailId = null;
    @Tag(tag=4) public MailTextContent mailTextContent = null;
    @Tag(tag=7) public List<MailItem> itemList = new ArrayList<>();
    @Tag(tag=8) public Integer sendTime = null;
    @Tag(tag=9) public Integer expireTime = null;
    @Tag(tag=10) public Integer importance = null;
    @Tag(tag=11) public Boolean isRead = null;
    @Tag(tag=12) public Boolean isAttachmentGot = null;
    @Tag(tag=13) public Integer configId = null;
    @Tag(tag=14) public List<String> argumentList = new ArrayList<>();
    @Tag(tag=15) public Integer collectState = null;
}
