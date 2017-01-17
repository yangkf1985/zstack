package org.zstack.header.storage.primary

import org.zstack.header.storage.primary.APIUpdatePrimaryStorageEvent

doc {
    title "UpdatePrimaryStorage"

    category "storage.primary"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/primary-storage/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APIUpdatePrimaryStorageMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "updatePrimaryStorage"
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "name"
					enclosedIn "updatePrimaryStorage"
					desc "资源名称"
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "description"
					enclosedIn "updatePrimaryStorage"
					desc "资源的详细描述"
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "url"
					enclosedIn "updatePrimaryStorage"
					desc ""
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "systemTags"
 					enclosedIn ""
 					desc ""
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc "用户标签"
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIUpdatePrimaryStorageEvent.class
        }
    }
}